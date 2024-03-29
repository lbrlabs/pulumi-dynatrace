// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.OpentelemetryMetricsAdditionalAttributesAdditionalAttribute;
import java.util.List;
import java.util.Objects;

@CustomType
public final class OpentelemetryMetricsAdditionalAttributes {
    private List<OpentelemetryMetricsAdditionalAttributesAdditionalAttribute> additionalAttributes;

    private OpentelemetryMetricsAdditionalAttributes() {}
    public List<OpentelemetryMetricsAdditionalAttributesAdditionalAttribute> additionalAttributes() {
        return this.additionalAttributes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OpentelemetryMetricsAdditionalAttributes defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<OpentelemetryMetricsAdditionalAttributesAdditionalAttribute> additionalAttributes;
        public Builder() {}
        public Builder(OpentelemetryMetricsAdditionalAttributes defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalAttributes = defaults.additionalAttributes;
        }

        @CustomType.Setter
        public Builder additionalAttributes(List<OpentelemetryMetricsAdditionalAttributesAdditionalAttribute> additionalAttributes) {
            this.additionalAttributes = Objects.requireNonNull(additionalAttributes);
            return this;
        }
        public Builder additionalAttributes(OpentelemetryMetricsAdditionalAttributesAdditionalAttribute... additionalAttributes) {
            return additionalAttributes(List.of(additionalAttributes));
        }
        public OpentelemetryMetricsAdditionalAttributes build() {
            final var o = new OpentelemetryMetricsAdditionalAttributes();
            o.additionalAttributes = additionalAttributes;
            return o;
        }
    }
}
