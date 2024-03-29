// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.WebAppAnomaliesResponseTimeResponseTimeAutoArgs;
import com.pulumi.dynatrace.inputs.WebAppAnomaliesResponseTimeResponseTimeFixedArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAppAnomaliesResponseTimeArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAppAnomaliesResponseTimeArgs Empty = new WebAppAnomaliesResponseTimeArgs();

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
    @Import(name="responseTimeAuto")
    private @Nullable Output<WebAppAnomaliesResponseTimeResponseTimeAutoArgs> responseTimeAuto;

    /**
     * @return no documentation available
     * 
     */
    public Optional<Output<WebAppAnomaliesResponseTimeResponseTimeAutoArgs>> responseTimeAuto() {
        return Optional.ofNullable(this.responseTimeAuto);
    }

    /**
     * no documentation available
     * 
     */
    @Import(name="responseTimeFixed")
    private @Nullable Output<WebAppAnomaliesResponseTimeResponseTimeFixedArgs> responseTimeFixed;

    /**
     * @return no documentation available
     * 
     */
    public Optional<Output<WebAppAnomaliesResponseTimeResponseTimeFixedArgs>> responseTimeFixed() {
        return Optional.ofNullable(this.responseTimeFixed);
    }

    private WebAppAnomaliesResponseTimeArgs() {}

    private WebAppAnomaliesResponseTimeArgs(WebAppAnomaliesResponseTimeArgs $) {
        this.detectionMode = $.detectionMode;
        this.enabled = $.enabled;
        this.responseTimeAuto = $.responseTimeAuto;
        this.responseTimeFixed = $.responseTimeFixed;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAppAnomaliesResponseTimeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAppAnomaliesResponseTimeArgs $;

        public Builder() {
            $ = new WebAppAnomaliesResponseTimeArgs();
        }

        public Builder(WebAppAnomaliesResponseTimeArgs defaults) {
            $ = new WebAppAnomaliesResponseTimeArgs(Objects.requireNonNull(defaults));
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
         * @param responseTimeAuto no documentation available
         * 
         * @return builder
         * 
         */
        public Builder responseTimeAuto(@Nullable Output<WebAppAnomaliesResponseTimeResponseTimeAutoArgs> responseTimeAuto) {
            $.responseTimeAuto = responseTimeAuto;
            return this;
        }

        /**
         * @param responseTimeAuto no documentation available
         * 
         * @return builder
         * 
         */
        public Builder responseTimeAuto(WebAppAnomaliesResponseTimeResponseTimeAutoArgs responseTimeAuto) {
            return responseTimeAuto(Output.of(responseTimeAuto));
        }

        /**
         * @param responseTimeFixed no documentation available
         * 
         * @return builder
         * 
         */
        public Builder responseTimeFixed(@Nullable Output<WebAppAnomaliesResponseTimeResponseTimeFixedArgs> responseTimeFixed) {
            $.responseTimeFixed = responseTimeFixed;
            return this;
        }

        /**
         * @param responseTimeFixed no documentation available
         * 
         * @return builder
         * 
         */
        public Builder responseTimeFixed(WebAppAnomaliesResponseTimeResponseTimeFixedArgs responseTimeFixed) {
            return responseTimeFixed(Output.of(responseTimeFixed));
        }

        public WebAppAnomaliesResponseTimeArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}
