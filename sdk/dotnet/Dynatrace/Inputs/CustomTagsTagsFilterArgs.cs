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

    public sealed class CustomTagsTagsFilterArgs : global::Pulumi.ResourceArgs
    {
        [Input("context", required: true)]
        public Input<string> Context { get; set; } = null!;

        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        [Input("value")]
        public Input<string>? Value { get; set; }

        public CustomTagsTagsFilterArgs()
        {
        }
        public static new CustomTagsTagsFilterArgs Empty => new CustomTagsTagsFilterArgs();
    }
}
