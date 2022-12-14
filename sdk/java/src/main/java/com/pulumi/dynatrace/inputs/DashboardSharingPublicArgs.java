// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class DashboardSharingPublicArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardSharingPublicArgs Empty = new DashboardSharingPublicArgs();

    /**
     * A list of management zones that can display data on the publicly shared dashboard.
     * 
     */
    @Import(name="managementZones", required=true)
    private Output<List<String>> managementZones;

    /**
     * @return A list of management zones that can display data on the publicly shared dashboard.
     * 
     */
    public Output<List<String>> managementZones() {
        return this.managementZones;
    }

    private DashboardSharingPublicArgs() {}

    private DashboardSharingPublicArgs(DashboardSharingPublicArgs $) {
        this.managementZones = $.managementZones;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardSharingPublicArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardSharingPublicArgs $;

        public Builder() {
            $ = new DashboardSharingPublicArgs();
        }

        public Builder(DashboardSharingPublicArgs defaults) {
            $ = new DashboardSharingPublicArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param managementZones A list of management zones that can display data on the publicly shared dashboard.
         * 
         * @return builder
         * 
         */
        public Builder managementZones(Output<List<String>> managementZones) {
            $.managementZones = managementZones;
            return this;
        }

        /**
         * @param managementZones A list of management zones that can display data on the publicly shared dashboard.
         * 
         * @return builder
         * 
         */
        public Builder managementZones(List<String> managementZones) {
            return managementZones(Output.of(managementZones));
        }

        /**
         * @param managementZones A list of management zones that can display data on the publicly shared dashboard.
         * 
         * @return builder
         * 
         */
        public Builder managementZones(String... managementZones) {
            return managementZones(List.of(managementZones));
        }

        public DashboardSharingPublicArgs build() {
            $.managementZones = Objects.requireNonNull($.managementZones, "expected parameter 'managementZones' to be non-null");
            return $;
        }
    }

}
