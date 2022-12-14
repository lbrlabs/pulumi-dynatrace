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

    public sealed class WebApplicationMonitoringSettingsAdvancedJavascriptTagSettingsAdditionalEventHandlersGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("blur")]
        public Input<bool>? Blur { get; set; }

        [Input("change")]
        public Input<bool>? Change { get; set; }

        [Input("click")]
        public Input<bool>? Click { get; set; }

        [Input("maxDomNodes", required: true)]
        public Input<int> MaxDomNodes { get; set; } = null!;

        [Input("mouseup")]
        public Input<bool>? Mouseup { get; set; }

        [Input("toStringMethod")]
        public Input<bool>? ToStringMethod { get; set; }

        [Input("useMouseUpEventForClicks")]
        public Input<bool>? UseMouseUpEventForClicks { get; set; }

        public WebApplicationMonitoringSettingsAdvancedJavascriptTagSettingsAdditionalEventHandlersGetArgs()
        {
        }
        public static new WebApplicationMonitoringSettingsAdvancedJavascriptTagSettingsAdditionalEventHandlersGetArgs Empty => new WebApplicationMonitoringSettingsAdvancedJavascriptTagSettingsAdditionalEventHandlersGetArgs();
    }
}
