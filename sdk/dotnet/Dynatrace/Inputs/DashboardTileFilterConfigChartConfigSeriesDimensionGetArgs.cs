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

    public sealed class DashboardTileFilterConfigChartConfigSeriesDimensionGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("entityDimension")]
        public Input<bool>? EntityDimension { get; set; }

        /// <summary>
        /// The ID of this resource.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// allows for configuring properties that are not explicitly supported by the current version of this provider
        /// </summary>
        [Input("unknowns")]
        public Input<string>? Unknowns { get; set; }

        [Input("values")]
        private InputList<string>? _values;
        public InputList<string> Values
        {
            get => _values ?? (_values = new InputList<string>());
            set => _values = value;
        }

        public DashboardTileFilterConfigChartConfigSeriesDimensionGetArgs()
        {
        }
        public static new DashboardTileFilterConfigChartConfigSeriesDimensionGetArgs Empty => new DashboardTileFilterConfigChartConfigSeriesDimensionGetArgs();
    }
}
