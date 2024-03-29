// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.MobileAppAnomaliesSlowUserActionsSlowUserActionsAutoArgs;
import com.pulumi.dynatrace.inputs.MobileAppAnomaliesSlowUserActionsSlowUserActionsFixedArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MobileAppAnomaliesSlowUserActionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final MobileAppAnomaliesSlowUserActionsArgs Empty = new MobileAppAnomaliesSlowUserActionsArgs();

    /**
     * Possible Values: `Auto`, `Fixed`
     * 
     */
    @Import(name="detectionMode")
    private @Nullable Output<String> detectionMode;

    /**
     * @return Possible Values: `Auto`, `Fixed`
     * 
     */
    public Optional<Output<String>> detectionMode() {
        return Optional.ofNullable(this.detectionMode);
    }

    /**
     * This setting is enabled (`true`) or disabled (`false`)
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return This setting is enabled (`true`) or disabled (`false`)
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * no documentation available
     * 
     */
    @Import(name="slowUserActionsAuto")
    private @Nullable Output<MobileAppAnomaliesSlowUserActionsSlowUserActionsAutoArgs> slowUserActionsAuto;

    /**
     * @return no documentation available
     * 
     */
    public Optional<Output<MobileAppAnomaliesSlowUserActionsSlowUserActionsAutoArgs>> slowUserActionsAuto() {
        return Optional.ofNullable(this.slowUserActionsAuto);
    }

    /**
     * no documentation available
     * 
     */
    @Import(name="slowUserActionsFixed")
    private @Nullable Output<MobileAppAnomaliesSlowUserActionsSlowUserActionsFixedArgs> slowUserActionsFixed;

    /**
     * @return no documentation available
     * 
     */
    public Optional<Output<MobileAppAnomaliesSlowUserActionsSlowUserActionsFixedArgs>> slowUserActionsFixed() {
        return Optional.ofNullable(this.slowUserActionsFixed);
    }

    private MobileAppAnomaliesSlowUserActionsArgs() {}

    private MobileAppAnomaliesSlowUserActionsArgs(MobileAppAnomaliesSlowUserActionsArgs $) {
        this.detectionMode = $.detectionMode;
        this.enabled = $.enabled;
        this.slowUserActionsAuto = $.slowUserActionsAuto;
        this.slowUserActionsFixed = $.slowUserActionsFixed;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MobileAppAnomaliesSlowUserActionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MobileAppAnomaliesSlowUserActionsArgs $;

        public Builder() {
            $ = new MobileAppAnomaliesSlowUserActionsArgs();
        }

        public Builder(MobileAppAnomaliesSlowUserActionsArgs defaults) {
            $ = new MobileAppAnomaliesSlowUserActionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param detectionMode Possible Values: `Auto`, `Fixed`
         * 
         * @return builder
         * 
         */
        public Builder detectionMode(@Nullable Output<String> detectionMode) {
            $.detectionMode = detectionMode;
            return this;
        }

        /**
         * @param detectionMode Possible Values: `Auto`, `Fixed`
         * 
         * @return builder
         * 
         */
        public Builder detectionMode(String detectionMode) {
            return detectionMode(Output.of(detectionMode));
        }

        /**
         * @param enabled This setting is enabled (`true`) or disabled (`false`)
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled This setting is enabled (`true`) or disabled (`false`)
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param slowUserActionsAuto no documentation available
         * 
         * @return builder
         * 
         */
        public Builder slowUserActionsAuto(@Nullable Output<MobileAppAnomaliesSlowUserActionsSlowUserActionsAutoArgs> slowUserActionsAuto) {
            $.slowUserActionsAuto = slowUserActionsAuto;
            return this;
        }

        /**
         * @param slowUserActionsAuto no documentation available
         * 
         * @return builder
         * 
         */
        public Builder slowUserActionsAuto(MobileAppAnomaliesSlowUserActionsSlowUserActionsAutoArgs slowUserActionsAuto) {
            return slowUserActionsAuto(Output.of(slowUserActionsAuto));
        }

        /**
         * @param slowUserActionsFixed no documentation available
         * 
         * @return builder
         * 
         */
        public Builder slowUserActionsFixed(@Nullable Output<MobileAppAnomaliesSlowUserActionsSlowUserActionsFixedArgs> slowUserActionsFixed) {
            $.slowUserActionsFixed = slowUserActionsFixed;
            return this;
        }

        /**
         * @param slowUserActionsFixed no documentation available
         * 
         * @return builder
         * 
         */
        public Builder slowUserActionsFixed(MobileAppAnomaliesSlowUserActionsSlowUserActionsFixedArgs slowUserActionsFixed) {
            return slowUserActionsFixed(Output.of(slowUserActionsFixed));
        }

        public MobileAppAnomaliesSlowUserActionsArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}
