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

    public sealed class WebAppRequestErrorsErrorRulesErrorRuleFilterSettingsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("filter")]
        public Input<string>? Filter { get; set; }

        [Input("url")]
        public Input<string>? Url { get; set; }

        public WebAppRequestErrorsErrorRulesErrorRuleFilterSettingsGetArgs()
        {
        }
        public static new WebAppRequestErrorsErrorRulesErrorRuleFilterSettingsGetArgs Empty => new WebAppRequestErrorsErrorRulesErrorRuleFilterSettingsGetArgs();
    }
}
