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

    public sealed class AlertingFiltersFilterArgs : global::Pulumi.ResourceArgs
    {
        [Input("custom")]
        public Input<Inputs.AlertingFiltersFilterCustomArgs>? Custom { get; set; }

        [Input("predefined")]
        public Input<Inputs.AlertingFiltersFilterPredefinedArgs>? Predefined { get; set; }

        public AlertingFiltersFilterArgs()
        {
        }
        public static new AlertingFiltersFilterArgs Empty => new AlertingFiltersFilterArgs();
    }
}
