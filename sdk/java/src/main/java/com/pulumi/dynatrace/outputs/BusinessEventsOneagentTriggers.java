// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.BusinessEventsOneagentTriggersTrigger;
import java.util.List;
import java.util.Objects;

@CustomType
public final class BusinessEventsOneagentTriggers {
    private List<BusinessEventsOneagentTriggersTrigger> triggers;

    private BusinessEventsOneagentTriggers() {}
    public List<BusinessEventsOneagentTriggersTrigger> triggers() {
        return this.triggers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BusinessEventsOneagentTriggers defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<BusinessEventsOneagentTriggersTrigger> triggers;
        public Builder() {}
        public Builder(BusinessEventsOneagentTriggers defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.triggers = defaults.triggers;
        }

        @CustomType.Setter
        public Builder triggers(List<BusinessEventsOneagentTriggersTrigger> triggers) {
            this.triggers = Objects.requireNonNull(triggers);
            return this;
        }
        public Builder triggers(BusinessEventsOneagentTriggersTrigger... triggers) {
            return triggers(List.of(triggers));
        }
        public BusinessEventsOneagentTriggers build() {
            final var o = new BusinessEventsOneagentTriggers();
            o.triggers = triggers;
            return o;
        }
    }
}
