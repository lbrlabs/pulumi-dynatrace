// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.MobileAppAnomaliesSlowUserActionsSlowUserActionsAuto;
import com.pulumi.dynatrace.outputs.MobileAppAnomaliesSlowUserActionsSlowUserActionsFixed;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MobileAppAnomaliesSlowUserActions {
    /**
     * @return Possible Values: `Auto`, `Fixed`
     * 
     */
    private @Nullable String detectionMode;
    /**
     * @return This setting is enabled (`true`) or disabled (`false`)
     * 
     */
    private Boolean enabled;
    /**
     * @return no documentation available
     * 
     */
    private @Nullable MobileAppAnomaliesSlowUserActionsSlowUserActionsAuto slowUserActionsAuto;
    /**
     * @return no documentation available
     * 
     */
    private @Nullable MobileAppAnomaliesSlowUserActionsSlowUserActionsFixed slowUserActionsFixed;

    private MobileAppAnomaliesSlowUserActions() {}
    /**
     * @return Possible Values: `Auto`, `Fixed`
     * 
     */
    public Optional<String> detectionMode() {
        return Optional.ofNullable(this.detectionMode);
    }
    /**
     * @return This setting is enabled (`true`) or disabled (`false`)
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return no documentation available
     * 
     */
    public Optional<MobileAppAnomaliesSlowUserActionsSlowUserActionsAuto> slowUserActionsAuto() {
        return Optional.ofNullable(this.slowUserActionsAuto);
    }
    /**
     * @return no documentation available
     * 
     */
    public Optional<MobileAppAnomaliesSlowUserActionsSlowUserActionsFixed> slowUserActionsFixed() {
        return Optional.ofNullable(this.slowUserActionsFixed);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MobileAppAnomaliesSlowUserActions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String detectionMode;
        private Boolean enabled;
        private @Nullable MobileAppAnomaliesSlowUserActionsSlowUserActionsAuto slowUserActionsAuto;
        private @Nullable MobileAppAnomaliesSlowUserActionsSlowUserActionsFixed slowUserActionsFixed;
        public Builder() {}
        public Builder(MobileAppAnomaliesSlowUserActions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.detectionMode = defaults.detectionMode;
    	      this.enabled = defaults.enabled;
    	      this.slowUserActionsAuto = defaults.slowUserActionsAuto;
    	      this.slowUserActionsFixed = defaults.slowUserActionsFixed;
        }

        @CustomType.Setter
        public Builder detectionMode(@Nullable String detectionMode) {
            this.detectionMode = detectionMode;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        @CustomType.Setter
        public Builder slowUserActionsAuto(@Nullable MobileAppAnomaliesSlowUserActionsSlowUserActionsAuto slowUserActionsAuto) {
            this.slowUserActionsAuto = slowUserActionsAuto;
            return this;
        }
        @CustomType.Setter
        public Builder slowUserActionsFixed(@Nullable MobileAppAnomaliesSlowUserActionsSlowUserActionsFixed slowUserActionsFixed) {
            this.slowUserActionsFixed = slowUserActionsFixed;
            return this;
        }
        public MobileAppAnomaliesSlowUserActions build() {
            final var o = new MobileAppAnomaliesSlowUserActions();
            o.detectionMode = detectionMode;
            o.enabled = enabled;
            o.slowUserActionsAuto = slowUserActionsAuto;
            o.slowUserActionsFixed = slowUserActionsFixed;
            return o;
        }
    }
}
