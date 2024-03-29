// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.DashboardsAllowlistAllowlistArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardsAllowlistArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardsAllowlistArgs Empty = new DashboardsAllowlistArgs();

    /**
     * List of URL pattern matchers
     * 
     */
    @Import(name="allowlist")
    private @Nullable Output<DashboardsAllowlistAllowlistArgs> allowlist;

    /**
     * @return List of URL pattern matchers
     * 
     */
    public Optional<Output<DashboardsAllowlistAllowlistArgs>> allowlist() {
        return Optional.ofNullable(this.allowlist);
    }

    private DashboardsAllowlistArgs() {}

    private DashboardsAllowlistArgs(DashboardsAllowlistArgs $) {
        this.allowlist = $.allowlist;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardsAllowlistArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardsAllowlistArgs $;

        public Builder() {
            $ = new DashboardsAllowlistArgs();
        }

        public Builder(DashboardsAllowlistArgs defaults) {
            $ = new DashboardsAllowlistArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowlist List of URL pattern matchers
         * 
         * @return builder
         * 
         */
        public Builder allowlist(@Nullable Output<DashboardsAllowlistAllowlistArgs> allowlist) {
            $.allowlist = allowlist;
            return this;
        }

        /**
         * @param allowlist List of URL pattern matchers
         * 
         * @return builder
         * 
         */
        public Builder allowlist(DashboardsAllowlistAllowlistArgs allowlist) {
            return allowlist(Output.of(allowlist));
        }

        public DashboardsAllowlistArgs build() {
            return $;
        }
    }

}
