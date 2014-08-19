/**
 *  Make sure your agent.properties contains entries for bmc.username, bmc.password, bmc.imname, and bmc.wsdl or this
 *  example won't work!
 */


// simple alias for the Java package; makes the code easier to read :)
var bmc = com.newrelic.apm.enterprise.bmc;

// utility function to make SOAP events
var makeEvent = function(subject, nameValues) {
    var bmcEvent = new bmc.Event();
    bmcEvent.setSubject(subject);

    for (var name in nameValues) {
        var value = nameValues[name];

        var nameValue = new bmc.NameValue();
        nameValue.setName(name);
        var valueObj = new bmc.Value();
        nameValue.setValue(valueObj);

        var type = typeof value;
        if (type === "string") {
            valueObj.setStringValue(value);
            nameValue.setValueType(bmc.DataType.STRING);
        } else if (type === "number") {
            valueObj.setIntValue(value);
            nameValue.setValueType(bmc.DataType.INT);
        } else {
            console.log("Unsupported type: " + type);
        }

        bmcEvent.getNameValueElement().add(nameValue);
    }

    return bmcEvent;
};

// make a sample event
var bmcEvent = makeEvent("subject", {
    msg: event.message,
    foo: "bar",
    baz: 123
});

// connect using the configured username, password, and imname
var connId = impactManager.connect(config.get("bmc.username"), config.get("bmc.password"), config.get("bmc.imname"), bmc.IMBufferType.BMCII_BUFFER_MODE_DEFAULT);

// send the event
impactManager.sendEvent(connId, bmcEvent, 60, "EVENT", bmc.IMMessageType.MSG_TYPE_NEW_EVENT);

// disconnect
impactManager.disconnect(connId, true);
