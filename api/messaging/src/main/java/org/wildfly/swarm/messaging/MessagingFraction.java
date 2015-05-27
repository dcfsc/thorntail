package org.wildfly.swarm.messaging;

import org.wildfly.swarm.container.Fraction;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bob McWhirter
 */
public class MessagingFraction implements Fraction {

    private List<MessagingServer> servers = new ArrayList<>();

    public MessagingFraction() {

    }

    public MessagingFraction server(MessagingServer server) {
        this.servers.add( server );
        return this;
    }

    public List<MessagingServer> servers() {
        return this.servers;
    }
}
