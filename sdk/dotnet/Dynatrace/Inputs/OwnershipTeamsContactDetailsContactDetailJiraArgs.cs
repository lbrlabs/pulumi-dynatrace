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

    public sealed class OwnershipTeamsContactDetailsContactDetailJiraArgs : global::Pulumi.ResourceArgs
    {
        [Input("defaultAssignee", required: true)]
        public Input<string> DefaultAssignee { get; set; } = null!;

        [Input("project", required: true)]
        public Input<string> Project { get; set; } = null!;

        public OwnershipTeamsContactDetailsContactDetailJiraArgs()
        {
        }
        public static new OwnershipTeamsContactDetailsContactDetailJiraArgs Empty => new OwnershipTeamsContactDetailsContactDetailJiraArgs();
    }
}
