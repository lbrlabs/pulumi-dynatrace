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

    public sealed class GenericTypesRulesRuleAttributesAttributeGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The human readable type name for this entity type.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        [Input("pattern", required: true)]
        public Input<string> Pattern { get; set; } = null!;

        public GenericTypesRulesRuleAttributesAttributeGetArgs()
        {
        }
        public static new GenericTypesRulesRuleAttributesAttributeGetArgs Empty => new GenericTypesRulesRuleAttributesAttributeGetArgs();
    }
}
