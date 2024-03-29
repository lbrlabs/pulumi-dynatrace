// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.K8sNamespaceAnomaliesMemoryLimitsQuotaSaturationConfiguration;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class K8sNamespaceAnomaliesMemoryLimitsQuotaSaturation {
    /**
     * @return Alert if
     * 
     */
    private @Nullable K8sNamespaceAnomaliesMemoryLimitsQuotaSaturationConfiguration configuration;
    /**
     * @return This setting is enabled (`true`) or disabled (`false`)
     * 
     */
    private Boolean enabled;

    private K8sNamespaceAnomaliesMemoryLimitsQuotaSaturation() {}
    /**
     * @return Alert if
     * 
     */
    public Optional<K8sNamespaceAnomaliesMemoryLimitsQuotaSaturationConfiguration> configuration() {
        return Optional.ofNullable(this.configuration);
    }
    /**
     * @return This setting is enabled (`true`) or disabled (`false`)
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(K8sNamespaceAnomaliesMemoryLimitsQuotaSaturation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable K8sNamespaceAnomaliesMemoryLimitsQuotaSaturationConfiguration configuration;
        private Boolean enabled;
        public Builder() {}
        public Builder(K8sNamespaceAnomaliesMemoryLimitsQuotaSaturation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configuration = defaults.configuration;
    	      this.enabled = defaults.enabled;
        }

        @CustomType.Setter
        public Builder configuration(@Nullable K8sNamespaceAnomaliesMemoryLimitsQuotaSaturationConfiguration configuration) {
            this.configuration = configuration;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public K8sNamespaceAnomaliesMemoryLimitsQuotaSaturation build() {
            final var o = new K8sNamespaceAnomaliesMemoryLimitsQuotaSaturation();
            o.configuration = configuration;
            o.enabled = enabled;
            return o;
        }
    }
}
