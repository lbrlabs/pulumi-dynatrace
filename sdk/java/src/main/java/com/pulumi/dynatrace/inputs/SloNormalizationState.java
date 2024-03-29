// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SloNormalizationState extends com.pulumi.resources.ResourceArgs {

    public static final SloNormalizationState Empty = new SloNormalizationState();

    /**
     * When set to true, the error budget left will be shown in percent of the total error budget. For more details see [SLO normalization help](https://dt-url.net/slo-normalize-error-budget).
     * 
     */
    @Import(name="normalize")
    private @Nullable Output<Boolean> normalize;

    /**
     * @return When set to true, the error budget left will be shown in percent of the total error budget. For more details see [SLO normalization help](https://dt-url.net/slo-normalize-error-budget).
     * 
     */
    public Optional<Output<Boolean>> normalize() {
        return Optional.ofNullable(this.normalize);
    }

    private SloNormalizationState() {}

    private SloNormalizationState(SloNormalizationState $) {
        this.normalize = $.normalize;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SloNormalizationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SloNormalizationState $;

        public Builder() {
            $ = new SloNormalizationState();
        }

        public Builder(SloNormalizationState defaults) {
            $ = new SloNormalizationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param normalize When set to true, the error budget left will be shown in percent of the total error budget. For more details see [SLO normalization help](https://dt-url.net/slo-normalize-error-budget).
         * 
         * @return builder
         * 
         */
        public Builder normalize(@Nullable Output<Boolean> normalize) {
            $.normalize = normalize;
            return this;
        }

        /**
         * @param normalize When set to true, the error budget left will be shown in percent of the total error budget. For more details see [SLO normalization help](https://dt-url.net/slo-normalize-error-budget).
         * 
         * @return builder
         * 
         */
        public Builder normalize(Boolean normalize) {
            return normalize(Output.of(normalize));
        }

        public SloNormalizationState build() {
            return $;
        }
    }

}
