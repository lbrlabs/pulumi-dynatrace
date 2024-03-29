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

    public sealed class ServiceExternalWebRequestIdContributorsContextRootServiceIdContributorGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("contributionType", required: true)]
        public Input<string> ContributionType { get; set; } = null!;

        [Input("segmentCount")]
        public Input<int>? SegmentCount { get; set; }

        [Input("transformations")]
        public Input<Inputs.ServiceExternalWebRequestIdContributorsContextRootServiceIdContributorTransformationsGetArgs>? Transformations { get; set; }

        [Input("valueOverride")]
        public Input<Inputs.ServiceExternalWebRequestIdContributorsContextRootServiceIdContributorValueOverrideGetArgs>? ValueOverride { get; set; }

        public ServiceExternalWebRequestIdContributorsContextRootServiceIdContributorGetArgs()
        {
        }
        public static new ServiceExternalWebRequestIdContributorsContextRootServiceIdContributorGetArgs Empty => new ServiceExternalWebRequestIdContributorsContextRootServiceIdContributorGetArgs();
    }
}
