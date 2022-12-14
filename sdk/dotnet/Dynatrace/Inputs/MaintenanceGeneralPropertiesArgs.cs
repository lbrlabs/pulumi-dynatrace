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

    public sealed class MaintenanceGeneralPropertiesArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A short description of the maintenance purpose
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Suppress execution of synthetic monitors during the maintenance
        /// </summary>
        [Input("disableSynthetic")]
        public Input<bool>? DisableSynthetic { get; set; }

        /// <summary>
        /// The name of the maintenance window, displayed in the UI
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The type of suppression of alerting and problem detection during the maintenance
        /// </summary>
        [Input("suppression", required: true)]
        public Input<string> Suppression { get; set; } = null!;

        /// <summary>
        /// The type of the maintenance: planned or unplanned
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public MaintenanceGeneralPropertiesArgs()
        {
        }
        public static new MaintenanceGeneralPropertiesArgs Empty => new MaintenanceGeneralPropertiesArgs();
    }
}
