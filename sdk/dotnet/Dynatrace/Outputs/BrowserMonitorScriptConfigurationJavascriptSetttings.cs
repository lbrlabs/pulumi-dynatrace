// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Dynatrace.Outputs
{

    [OutputType]
    public sealed class BrowserMonitorScriptConfigurationJavascriptSetttings
    {
        public readonly string? CustomProperties;
        public readonly Outputs.BrowserMonitorScriptConfigurationJavascriptSetttingsTimeoutSettings? TimeoutSettings;
        public readonly Outputs.BrowserMonitorScriptConfigurationJavascriptSetttingsVisuallyCompleteOptions? VisuallyCompleteOptions;

        [OutputConstructor]
        private BrowserMonitorScriptConfigurationJavascriptSetttings(
            string? customProperties,

            Outputs.BrowserMonitorScriptConfigurationJavascriptSetttingsTimeoutSettings? timeoutSettings,

            Outputs.BrowserMonitorScriptConfigurationJavascriptSetttingsVisuallyCompleteOptions? visuallyCompleteOptions)
        {
            CustomProperties = customProperties;
            TimeoutSettings = timeoutSettings;
            VisuallyCompleteOptions = visuallyCompleteOptions;
        }
    }
}
