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

    public sealed class WebAppAnomaliesResponseTimeResponseTimeFixedOverAlertingProtectionGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("actionsPerMinute", required: true)]
        public Input<double> ActionsPerMinute { get; set; } = null!;

        [Input("minutesAbnormalState", required: true)]
        public Input<double> MinutesAbnormalState { get; set; } = null!;

        public WebAppAnomaliesResponseTimeResponseTimeFixedOverAlertingProtectionGetArgs()
        {
        }
        public static new WebAppAnomaliesResponseTimeResponseTimeFixedOverAlertingProtectionGetArgs Empty => new WebAppAnomaliesResponseTimeResponseTimeFixedOverAlertingProtectionGetArgs();
    }
}
