// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.HostAnomaliesV2HostArgs;
import com.pulumi.dynatrace.inputs.HostAnomaliesV2NetworkArgs;
import java.lang.String;
import java.util.Objects;


public final class HostAnomaliesV2Args extends com.pulumi.resources.ResourceArgs {

    public static final HostAnomaliesV2Args Empty = new HostAnomaliesV2Args();

    /**
     * Hosts
     * 
     */
    @Import(name="host", required=true)
    private Output<HostAnomaliesV2HostArgs> host;

    /**
     * @return Hosts
     * 
     */
    public Output<HostAnomaliesV2HostArgs> host() {
        return this.host;
    }

    /**
     * Network
     * 
     */
    @Import(name="network", required=true)
    private Output<HostAnomaliesV2NetworkArgs> network;

    /**
     * @return Network
     * 
     */
    public Output<HostAnomaliesV2NetworkArgs> network() {
        return this.network;
    }

    /**
     * The scope of this setting (HOST HOST_GROUP environment)
     * 
     */
    @Import(name="scope", required=true)
    private Output<String> scope;

    /**
     * @return The scope of this setting (HOST HOST_GROUP environment)
     * 
     */
    public Output<String> scope() {
        return this.scope;
    }

    private HostAnomaliesV2Args() {}

    private HostAnomaliesV2Args(HostAnomaliesV2Args $) {
        this.host = $.host;
        this.network = $.network;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HostAnomaliesV2Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HostAnomaliesV2Args $;

        public Builder() {
            $ = new HostAnomaliesV2Args();
        }

        public Builder(HostAnomaliesV2Args defaults) {
            $ = new HostAnomaliesV2Args(Objects.requireNonNull(defaults));
        }

        /**
         * @param host Hosts
         * 
         * @return builder
         * 
         */
        public Builder host(Output<HostAnomaliesV2HostArgs> host) {
            $.host = host;
            return this;
        }

        /**
         * @param host Hosts
         * 
         * @return builder
         * 
         */
        public Builder host(HostAnomaliesV2HostArgs host) {
            return host(Output.of(host));
        }

        /**
         * @param network Network
         * 
         * @return builder
         * 
         */
        public Builder network(Output<HostAnomaliesV2NetworkArgs> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network Network
         * 
         * @return builder
         * 
         */
        public Builder network(HostAnomaliesV2NetworkArgs network) {
            return network(Output.of(network));
        }

        /**
         * @param scope The scope of this setting (HOST HOST_GROUP environment)
         * 
         * @return builder
         * 
         */
        public Builder scope(Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope The scope of this setting (HOST HOST_GROUP environment)
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        public HostAnomaliesV2Args build() {
            $.host = Objects.requireNonNull($.host, "expected parameter 'host' to be non-null");
            $.network = Objects.requireNonNull($.network, "expected parameter 'network' to be non-null");
            $.scope = Objects.requireNonNull($.scope, "expected parameter 'scope' to be non-null");
            return $;
        }
    }

}
