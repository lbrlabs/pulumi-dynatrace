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

    public sealed class WebApplicationUserActionNamingSettingsXhrActionNamingRulesRuleConditionsConditionGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("operand1", required: true)]
        public Input<string> Operand1 { get; set; } = null!;

        [Input("operand2")]
        public Input<string>? Operand2 { get; set; }

        [Input("operator", required: true)]
        public Input<string> Operator { get; set; } = null!;

        public WebApplicationUserActionNamingSettingsXhrActionNamingRulesRuleConditionsConditionGetArgs()
        {
        }
        public static new WebApplicationUserActionNamingSettingsXhrActionNamingRulesRuleConditionsConditionGetArgs Empty => new WebApplicationUserActionNamingSettingsXhrActionNamingRulesRuleConditionsConditionGetArgs();
    }
}
