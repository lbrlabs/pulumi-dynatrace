// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BusinessEventsProcessingRuleTesting {
    private String sampleEvent;

    private BusinessEventsProcessingRuleTesting() {}
    public String sampleEvent() {
        return this.sampleEvent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BusinessEventsProcessingRuleTesting defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String sampleEvent;
        public Builder() {}
        public Builder(BusinessEventsProcessingRuleTesting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sampleEvent = defaults.sampleEvent;
        }

        @CustomType.Setter
        public Builder sampleEvent(String sampleEvent) {
            this.sampleEvent = Objects.requireNonNull(sampleEvent);
            return this;
        }
        public BusinessEventsProcessingRuleTesting build() {
            final var o = new BusinessEventsProcessingRuleTesting();
            o.sampleEvent = sampleEvent;
            return o;
        }
    }
}
