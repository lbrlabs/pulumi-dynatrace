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

    public sealed class ServiceFullWebServiceIdContributorsWebServiceNamespaceServiceIdContributorArgs : global::Pulumi.ResourceArgs
    {
        [Input("contributionType", required: true)]
        public Input<string> ContributionType { get; set; } = null!;

        [Input("transformations")]
        public Input<Inputs.ServiceFullWebServiceIdContributorsWebServiceNamespaceServiceIdContributorTransformationsArgs>? Transformations { get; set; }

        [Input("valueOverride")]
        public Input<Inputs.ServiceFullWebServiceIdContributorsWebServiceNamespaceServiceIdContributorValueOverrideArgs>? ValueOverride { get; set; }

        public ServiceFullWebServiceIdContributorsWebServiceNamespaceServiceIdContributorArgs()
        {
        }
        public static new ServiceFullWebServiceIdContributorsWebServiceNamespaceServiceIdContributorArgs Empty => new ServiceFullWebServiceIdContributorsWebServiceNamespaceServiceIdContributorArgs();
    }
}
