// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceAnomaliesLoadSpikesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceAnomaliesLoadSpikesArgs Empty = new ServiceAnomaliesLoadSpikesArgs();

    @Import(name="minutes")
    private @Nullable Output<Integer> minutes;

    public Optional<Output<Integer>> minutes() {
        return Optional.ofNullable(this.minutes);
    }

    @Import(name="percent")
    private @Nullable Output<Integer> percent;

    public Optional<Output<Integer>> percent() {
        return Optional.ofNullable(this.percent);
    }

    @Import(name="unknowns")
    private @Nullable Output<String> unknowns;

    public Optional<Output<String>> unknowns() {
        return Optional.ofNullable(this.unknowns);
    }

    private ServiceAnomaliesLoadSpikesArgs() {}

    private ServiceAnomaliesLoadSpikesArgs(ServiceAnomaliesLoadSpikesArgs $) {
        this.minutes = $.minutes;
        this.percent = $.percent;
        this.unknowns = $.unknowns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceAnomaliesLoadSpikesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceAnomaliesLoadSpikesArgs $;

        public Builder() {
            $ = new ServiceAnomaliesLoadSpikesArgs();
        }

        public Builder(ServiceAnomaliesLoadSpikesArgs defaults) {
            $ = new ServiceAnomaliesLoadSpikesArgs(Objects.requireNonNull(defaults));
        }

        public Builder minutes(@Nullable Output<Integer> minutes) {
            $.minutes = minutes;
            return this;
        }

        public Builder minutes(Integer minutes) {
            return minutes(Output.of(minutes));
        }

        public Builder percent(@Nullable Output<Integer> percent) {
            $.percent = percent;
            return this;
        }

        public Builder percent(Integer percent) {
            return percent(Output.of(percent));
        }

        public Builder unknowns(@Nullable Output<String> unknowns) {
            $.unknowns = unknowns;
            return this;
        }

        public Builder unknowns(String unknowns) {
            return unknowns(Output.of(unknowns));
        }

        public ServiceAnomaliesLoadSpikesArgs build() {
            return $;
        }
    }

}
