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

    public sealed class ServiceFullWebServiceIdContributorsApplicationIdArgs : global::Pulumi.ResourceArgs
    {
        [Input("enableIdContributor", required: true)]
        public Input<bool> EnableIdContributor { get; set; } = null!;

        [Input("serviceIdContributor")]
        public Input<Inputs.ServiceFullWebServiceIdContributorsApplicationIdServiceIdContributorArgs>? ServiceIdContributor { get; set; }

        public ServiceFullWebServiceIdContributorsApplicationIdArgs()
        {
        }
        public static new ServiceFullWebServiceIdContributorsApplicationIdArgs Empty => new ServiceFullWebServiceIdContributorsApplicationIdArgs();
    }
}
