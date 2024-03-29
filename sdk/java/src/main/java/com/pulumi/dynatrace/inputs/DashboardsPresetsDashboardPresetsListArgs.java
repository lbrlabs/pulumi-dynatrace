// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.DashboardsPresetsDashboardPresetsListDashboardPresetArgs;
import java.util.List;
import java.util.Objects;


public final class DashboardsPresetsDashboardPresetsListArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardsPresetsDashboardPresetsListArgs Empty = new DashboardsPresetsDashboardPresetsListArgs();

    @Import(name="dashboardPresets", required=true)
    private Output<List<DashboardsPresetsDashboardPresetsListDashboardPresetArgs>> dashboardPresets;

    public Output<List<DashboardsPresetsDashboardPresetsListDashboardPresetArgs>> dashboardPresets() {
        return this.dashboardPresets;
    }

    private DashboardsPresetsDashboardPresetsListArgs() {}

    private DashboardsPresetsDashboardPresetsListArgs(DashboardsPresetsDashboardPresetsListArgs $) {
        this.dashboardPresets = $.dashboardPresets;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardsPresetsDashboardPresetsListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardsPresetsDashboardPresetsListArgs $;

        public Builder() {
            $ = new DashboardsPresetsDashboardPresetsListArgs();
        }

        public Builder(DashboardsPresetsDashboardPresetsListArgs defaults) {
            $ = new DashboardsPresetsDashboardPresetsListArgs(Objects.requireNonNull(defaults));
        }

        public Builder dashboardPresets(Output<List<DashboardsPresetsDashboardPresetsListDashboardPresetArgs>> dashboardPresets) {
            $.dashboardPresets = dashboardPresets;
            return this;
        }

        public Builder dashboardPresets(List<DashboardsPresetsDashboardPresetsListDashboardPresetArgs> dashboardPresets) {
            return dashboardPresets(Output.of(dashboardPresets));
        }

        public Builder dashboardPresets(DashboardsPresetsDashboardPresetsListDashboardPresetArgs... dashboardPresets) {
            return dashboardPresets(List.of(dashboardPresets));
        }

        public DashboardsPresetsDashboardPresetsListArgs build() {
            $.dashboardPresets = Objects.requireNonNull($.dashboardPresets, "expected parameter 'dashboardPresets' to be non-null");
            return $;
        }
    }

}
