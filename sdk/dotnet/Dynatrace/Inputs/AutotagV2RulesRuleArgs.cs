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

    public sealed class AutotagV2RulesRuleArgs : global::Pulumi.ResourceArgs
    {
        [Input("attributeRule")]
        public Input<Inputs.AutotagV2RulesRuleAttributeRuleArgs>? AttributeRule { get; set; }

        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        [Input("entitySelector")]
        public Input<string>? EntitySelector { get; set; }

        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        [Input("valueFormat")]
        public Input<string>? ValueFormat { get; set; }

        [Input("valueNormalization", required: true)]
        public Input<string> ValueNormalization { get; set; } = null!;

        public AutotagV2RulesRuleArgs()
        {
        }
        public static new AutotagV2RulesRuleArgs Empty => new AutotagV2RulesRuleArgs();
    }
}
