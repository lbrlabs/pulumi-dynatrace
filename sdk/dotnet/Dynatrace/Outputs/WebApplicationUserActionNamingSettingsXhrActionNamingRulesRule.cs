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
    public sealed class WebApplicationUserActionNamingSettingsXhrActionNamingRulesRule
    {
        public readonly Outputs.WebApplicationUserActionNamingSettingsXhrActionNamingRulesRuleConditions? Conditions;
        public readonly string Template;
        public readonly bool? UseOrConditions;

        [OutputConstructor]
        private WebApplicationUserActionNamingSettingsXhrActionNamingRulesRule(
            Outputs.WebApplicationUserActionNamingSettingsXhrActionNamingRulesRuleConditions? conditions,

            string template,

            bool? useOrConditions)
        {
            Conditions = conditions;
            Template = template;
            UseOrConditions = useOrConditions;
        }
    }
}
