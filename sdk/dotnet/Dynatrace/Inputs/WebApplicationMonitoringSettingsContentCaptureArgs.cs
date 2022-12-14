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

    public sealed class WebApplicationMonitoringSettingsContentCaptureArgs : global::Pulumi.ResourceArgs
    {
        [Input("javascriptErrors")]
        public Input<bool>? JavascriptErrors { get; set; }

        [Input("resourceTimingSettings")]
        public Input<Inputs.WebApplicationMonitoringSettingsContentCaptureResourceTimingSettingsArgs>? ResourceTimingSettings { get; set; }

        [Input("timeoutSettings")]
        public Input<Inputs.WebApplicationMonitoringSettingsContentCaptureTimeoutSettingsArgs>? TimeoutSettings { get; set; }

        [Input("visuallyCompleteAndSpeedIndex")]
        public Input<bool>? VisuallyCompleteAndSpeedIndex { get; set; }

        [Input("visuallyCompleteSettings")]
        public Input<Inputs.WebApplicationMonitoringSettingsContentCaptureVisuallyCompleteSettingsArgs>? VisuallyCompleteSettings { get; set; }

        public WebApplicationMonitoringSettingsContentCaptureArgs()
        {
        }
        public static new WebApplicationMonitoringSettingsContentCaptureArgs Empty => new WebApplicationMonitoringSettingsContentCaptureArgs();
    }
}
