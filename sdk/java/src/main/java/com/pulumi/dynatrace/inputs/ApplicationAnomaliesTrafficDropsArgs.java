// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationAnomaliesTrafficDropsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationAnomaliesTrafficDropsArgs Empty = new ApplicationAnomaliesTrafficDropsArgs();

    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled;
    }

    @Import(name="percent")
    private @Nullable Output<Integer> percent;

    public Optional<Output<Integer>> percent() {
        return Optional.ofNullable(this.percent);
    }

    private ApplicationAnomaliesTrafficDropsArgs() {}

    private ApplicationAnomaliesTrafficDropsArgs(ApplicationAnomaliesTrafficDropsArgs $) {
        this.enabled = $.enabled;
        this.percent = $.percent;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationAnomaliesTrafficDropsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationAnomaliesTrafficDropsArgs $;

        public Builder() {
            $ = new ApplicationAnomaliesTrafficDropsArgs();
        }

        public Builder(ApplicationAnomaliesTrafficDropsArgs defaults) {
            $ = new ApplicationAnomaliesTrafficDropsArgs(Objects.requireNonNull(defaults));
        }

        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder percent(@Nullable Output<Integer> percent) {
            $.percent = percent;
            return this;
        }

        public Builder percent(Integer percent) {
            return percent(Output.of(percent));
        }

        public ApplicationAnomaliesTrafficDropsArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}
