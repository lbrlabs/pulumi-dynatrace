// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Dynatrace.Outputs
{

    [OutputType]
    public sealed class ServiceExternalWebRequestIdContributorsApplicationIdServiceIdContributorTransformations
    {
        public readonly ImmutableArray<Outputs.ServiceExternalWebRequestIdContributorsApplicationIdServiceIdContributorTransformationsTransformation> Transformations;

        [OutputConstructor]
        private ServiceExternalWebRequestIdContributorsApplicationIdServiceIdContributorTransformations(ImmutableArray<Outputs.ServiceExternalWebRequestIdContributorsApplicationIdServiceIdContributorTransformationsTransformation> transformations)
        {
            Transformations = transformations;
        }
    }
}