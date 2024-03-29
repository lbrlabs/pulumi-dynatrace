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

    public sealed class ServiceFullWebRequestIdContributorsContextRootServiceIdContributorArgs : global::Pulumi.ResourceArgs
    {
        [Input("contributionType", required: true)]
        public Input<string> ContributionType { get; set; } = null!;

        [Input("segmentCount")]
        public Input<int>? SegmentCount { get; set; }

        [Input("transformations")]
        public Input<Inputs.ServiceFullWebRequestIdContributorsContextRootServiceIdContributorTransformationsArgs>? Transformations { get; set; }

        [Input("valueOverride")]
        public Input<Inputs.ServiceFullWebRequestIdContributorsContextRootServiceIdContributorValueOverrideArgs>? ValueOverride { get; set; }

        public ServiceFullWebRequestIdContributorsContextRootServiceIdContributorArgs()
        {
        }
        public static new ServiceFullWebRequestIdContributorsContextRootServiceIdContributorArgs Empty => new ServiceFullWebRequestIdContributorsContextRootServiceIdContributorArgs();
    }
}
