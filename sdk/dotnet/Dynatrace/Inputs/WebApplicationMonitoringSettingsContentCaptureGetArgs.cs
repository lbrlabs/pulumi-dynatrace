// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Dynatrace.Inputs
{

    public sealed class WebApplicationMonitoringSettingsContentCaptureGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("javascriptErrors")]
        public Input<bool>? JavascriptErrors { get; set; }

        [Input("resourceTimingSettings")]
        public Input<Inputs.WebApplicationMonitoringSettingsContentCaptureResourceTimingSettingsGetArgs>? ResourceTimingSettings { get; set; }

        [Input("timeoutSettings")]
        public Input<Inputs.WebApplicationMonitoringSettingsContentCaptureTimeoutSettingsGetArgs>? TimeoutSettings { get; set; }

        [Input("visuallyCompleteAndSpeedIndex")]
        public Input<bool>? VisuallyCompleteAndSpeedIndex { get; set; }

        [Input("visuallyCompleteSettings")]
        public Input<Inputs.WebApplicationMonitoringSettingsContentCaptureVisuallyCompleteSettingsGetArgs>? VisuallyCompleteSettings { get; set; }

        public WebApplicationMonitoringSettingsContentCaptureGetArgs()
        {
        }
        public static new WebApplicationMonitoringSettingsContentCaptureGetArgs Empty => new WebApplicationMonitoringSettingsContentCaptureGetArgs();
    }
}
