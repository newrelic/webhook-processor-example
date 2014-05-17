package com.newrelic.apm.enterprise;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.google.inject.name.Named;
import io.iron.ironmq.Client;
import io.iron.ironmq.Cloud;
import io.iron.ironmq.Queue;

public class EnterpriseAgentModule extends AbstractModule {
    @Override
    protected void configure() {

    }

    @Provides
    @Singleton
    public Client getIronMqClient(@Named("ironmq.projectId") String projectId, @Named("ironmq.token") String token) {
        return new Client(projectId, token, Cloud.ironAWSUSEast);
    }

    @Provides
    @Singleton
    public Queue getIronQueue(@Named("ironmq.queueName") String queueName, Client client) {
        return client.queue(queueName);
    }
}
