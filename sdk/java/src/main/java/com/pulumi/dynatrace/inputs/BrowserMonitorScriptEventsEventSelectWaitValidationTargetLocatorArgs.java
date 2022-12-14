// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.BrowserMonitorScriptEventsEventSelectWaitValidationTargetLocatorLocatorArgs;
import java.util.List;
import java.util.Objects;


public final class BrowserMonitorScriptEventsEventSelectWaitValidationTargetLocatorArgs extends com.pulumi.resources.ResourceArgs {

    public static final BrowserMonitorScriptEventsEventSelectWaitValidationTargetLocatorArgs Empty = new BrowserMonitorScriptEventsEventSelectWaitValidationTargetLocatorArgs();

    @Import(name="locators", required=true)
    private Output<List<BrowserMonitorScriptEventsEventSelectWaitValidationTargetLocatorLocatorArgs>> locators;

    public Output<List<BrowserMonitorScriptEventsEventSelectWaitValidationTargetLocatorLocatorArgs>> locators() {
        return this.locators;
    }

    private BrowserMonitorScriptEventsEventSelectWaitValidationTargetLocatorArgs() {}

    private BrowserMonitorScriptEventsEventSelectWaitValidationTargetLocatorArgs(BrowserMonitorScriptEventsEventSelectWaitValidationTargetLocatorArgs $) {
        this.locators = $.locators;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BrowserMonitorScriptEventsEventSelectWaitValidationTargetLocatorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BrowserMonitorScriptEventsEventSelectWaitValidationTargetLocatorArgs $;

        public Builder() {
            $ = new BrowserMonitorScriptEventsEventSelectWaitValidationTargetLocatorArgs();
        }

        public Builder(BrowserMonitorScriptEventsEventSelectWaitValidationTargetLocatorArgs defaults) {
            $ = new BrowserMonitorScriptEventsEventSelectWaitValidationTargetLocatorArgs(Objects.requireNonNull(defaults));
        }

        public Builder locators(Output<List<BrowserMonitorScriptEventsEventSelectWaitValidationTargetLocatorLocatorArgs>> locators) {
            $.locators = locators;
            return this;
        }

        public Builder locators(List<BrowserMonitorScriptEventsEventSelectWaitValidationTargetLocatorLocatorArgs> locators) {
            return locators(Output.of(locators));
        }

        public Builder locators(BrowserMonitorScriptEventsEventSelectWaitValidationTargetLocatorLocatorArgs... locators) {
            return locators(List.of(locators));
        }

        public BrowserMonitorScriptEventsEventSelectWaitValidationTargetLocatorArgs build() {
            $.locators = Objects.requireNonNull($.locators, "expected parameter 'locators' to be non-null");
            return $;
        }
    }

}
