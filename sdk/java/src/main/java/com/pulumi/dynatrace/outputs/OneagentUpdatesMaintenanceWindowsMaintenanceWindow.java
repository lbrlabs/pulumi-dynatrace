// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class OneagentUpdatesMaintenanceWindowsMaintenanceWindow {
    private String maintenanceWindow;

    private OneagentUpdatesMaintenanceWindowsMaintenanceWindow() {}
    public String maintenanceWindow() {
        return this.maintenanceWindow;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OneagentUpdatesMaintenanceWindowsMaintenanceWindow defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String maintenanceWindow;
        public Builder() {}
        public Builder(OneagentUpdatesMaintenanceWindowsMaintenanceWindow defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maintenanceWindow = defaults.maintenanceWindow;
        }

        @CustomType.Setter
        public Builder maintenanceWindow(String maintenanceWindow) {
            this.maintenanceWindow = Objects.requireNonNull(maintenanceWindow);
            return this;
        }
        public OneagentUpdatesMaintenanceWindowsMaintenanceWindow build() {
            final var o = new OneagentUpdatesMaintenanceWindowsMaintenanceWindow();
            o.maintenanceWindow = maintenanceWindow;
            return o;
        }
    }
}
