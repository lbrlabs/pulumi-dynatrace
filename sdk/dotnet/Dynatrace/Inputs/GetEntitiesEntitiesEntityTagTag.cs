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

    public sealed class GetEntitiesEntitiesEntityTagTagArgs : global::Pulumi.InvokeArgs
    {
        [Input("context", required: true)]
        public string Context { get; set; } = null!;

        [Input("key", required: true)]
        public string Key { get; set; } = null!;

        [Input("stringRepresentation")]
        public string? StringRepresentation { get; set; }

        [Input("value")]
        public string? Value { get; set; }

        public GetEntitiesEntitiesEntityTagTagArgs()
        {
        }
        public static new GetEntitiesEntitiesEntityTagTagArgs Empty => new GetEntitiesEntitiesEntityTagTagArgs();
    }
}
