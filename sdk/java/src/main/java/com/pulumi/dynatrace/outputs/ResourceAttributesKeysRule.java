// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ResourceAttributesKeysRule {
    private String attributeKey;
    private Boolean enabled;
    private String masking;

    private ResourceAttributesKeysRule() {}
    public String attributeKey() {
        return this.attributeKey;
    }
    public Boolean enabled() {
        return this.enabled;
    }
    public String masking() {
        return this.masking;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceAttributesKeysRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String attributeKey;
        private Boolean enabled;
        private String masking;
        public Builder() {}
        public Builder(ResourceAttributesKeysRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributeKey = defaults.attributeKey;
    	      this.enabled = defaults.enabled;
    	      this.masking = defaults.masking;
        }

        @CustomType.Setter
        public Builder attributeKey(String attributeKey) {
            this.attributeKey = Objects.requireNonNull(attributeKey);
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        @CustomType.Setter
        public Builder masking(String masking) {
            this.masking = Objects.requireNonNull(masking);
            return this;
        }
        public ResourceAttributesKeysRule build() {
            final var o = new ResourceAttributesKeysRule();
            o.attributeKey = attributeKey;
            o.enabled = enabled;
            o.masking = masking;
            return o;
        }
    }
}
