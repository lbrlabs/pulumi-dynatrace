// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ImsBridgesQueueManagerQueueManager {
    /**
     * @return The name of the IMS bridge
     * 
     */
    private String name;
    private @Nullable List<String> queueManagerQueues;

    private ImsBridgesQueueManagerQueueManager() {}
    /**
     * @return The name of the IMS bridge
     * 
     */
    public String name() {
        return this.name;
    }
    public List<String> queueManagerQueues() {
        return this.queueManagerQueues == null ? List.of() : this.queueManagerQueues;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImsBridgesQueueManagerQueueManager defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private @Nullable List<String> queueManagerQueues;
        public Builder() {}
        public Builder(ImsBridgesQueueManagerQueueManager defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.queueManagerQueues = defaults.queueManagerQueues;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder queueManagerQueues(@Nullable List<String> queueManagerQueues) {
            this.queueManagerQueues = queueManagerQueues;
            return this;
        }
        public Builder queueManagerQueues(String... queueManagerQueues) {
            return queueManagerQueues(List.of(queueManagerQueues));
        }
        public ImsBridgesQueueManagerQueueManager build() {
            final var o = new ImsBridgesQueueManagerQueueManager();
            o.name = name;
            o.queueManagerQueues = queueManagerQueues;
            return o;
        }
    }
}
