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

    public sealed class ServiceFullWebRequestIdContributorsContextRootArgs : global::Pulumi.ResourceArgs
    {
        [Input("enableIdContributor", required: true)]
        public Input<bool> EnableIdContributor { get; set; } = null!;

        [Input("serviceIdContributor")]
        public Input<Inputs.ServiceFullWebRequestIdContributorsContextRootServiceIdContributorArgs>? ServiceIdContributor { get; set; }

        public ServiceFullWebRequestIdContributorsContextRootArgs()
        {
        }
        public static new ServiceFullWebRequestIdContributorsContextRootArgs Empty => new ServiceFullWebRequestIdContributorsContextRootArgs();
    }
}
