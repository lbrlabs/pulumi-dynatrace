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

    public sealed class RequestNamingPlaceholdersPlaceholderSourceServiceTagArgs : global::Pulumi.ResourceArgs
    {
        [Input("context")]
        public Input<string>? Context { get; set; }

        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        [Input("tagKey")]
        public Input<Inputs.RequestNamingPlaceholdersPlaceholderSourceServiceTagTagKeyArgs>? TagKey { get; set; }

        [Input("value")]
        public Input<string>? Value { get; set; }

        public RequestNamingPlaceholdersPlaceholderSourceServiceTagArgs()
        {
        }
        public static new RequestNamingPlaceholdersPlaceholderSourceServiceTagArgs Empty => new RequestNamingPlaceholdersPlaceholderSourceServiceTagArgs();
    }
}
