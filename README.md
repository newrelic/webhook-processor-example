Introduction
========================

This project is a simple utility to help integrating New Relic alerting webhooks in to 3rd party systems, even those
behind firewalls. It depends on [IronMQ](http://www.iron.io), an excellent SaaS message queue service, and
[Loggly](https://www.loggly.com), a SaaS log management service.

New Relic webhooks are routed through to this processor via IronMQ's [ability to accept webhooks](http://blog.iron.io/2013/01/queue-webhook-events-with-ironmq.html).
From there, the processor pulls the webhook off the queue and passes it in as the `event` object while executing some
custom JavaScript code. The JavaScript environment has access to various utilities, such as an HTTP library, which
makes it easy to transform the webhook payload and pass it on to any 3rd party system.

To facilitate with logging, we've also added optional support for [Loggly](https://www.loggly.com), a popular SaaS
log management service. When configured to use Loggly, all log messages will be pushed to the desired Loggly service
and you can have the option of updating the custom JavaScript remotely via an "update key".

Building
========================

Building this project requires Maven 3.1 or greater. Once `mvn` is in your classpath, building is as simple as running
`mvn install`. To prepare the full release, simply run `mvn -Prelease install` and look in the `target` directory for
the resulting zip file.

The project is also verified to open cleanly in IntelliJ IDEA. Simply open the `pom.xml` file as your project file.

Running It
=========================

Running is as simple as executing the shell script in the `bin` directory and pipping stdout/stderr to whatever log
file you like. This will launch the webhook processor and it will stay running until you kill the process.

Rapid Script Development
========================

You may also optionally run the program with the `--update-script` argument. This only works if you've configured
`remote.scriptUpdateKey` in the configuration file. This will take the contents of `script.js` and push them in to the
queue, allowing a separate running service to pick up the changes and load them locally. This is ideal for when you've
got the webhook processor service running on a separate server and you're using Loggly + this functionality to develop
remotely and iterate quickly with changes to the script.

Contribution Guidelines
========================

Contributions are welcome! There are two ways to get involved:

 * Open bugs/feature requests
 * Submit pull requests (preferred)

When submitting bugs, please remember that this is a volunteer effort. As such, we ask that you take the time to
explain any bugs in the most detail you can, including manual or automatic test cases that clearly showcase the
problem.

When submitting pull requests, we ask that you take the time to squash all commits and comment your code so that we
can easily understand what your changes do.

License
========================

This project is licensed under the *Apache 2.0 License*. Please see LICENSE.txt for more information.