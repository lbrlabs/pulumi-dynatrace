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

    public sealed class WebAppRequestErrorsErrorRulesErrorRuleGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("captureSettings", required: true)]
        public Input<Inputs.WebAppRequestErrorsErrorRulesErrorRuleCaptureSettingsGetArgs> CaptureSettings { get; set; } = null!;

        [Input("considerCspViolations", required: true)]
        public Input<bool> ConsiderCspViolations { get; set; } = null!;

        [Input("considerFailedImages", required: true)]
        public Input<bool> ConsiderFailedImages { get; set; } = null!;

        [Input("errorCodes")]
        public Input<string>? ErrorCodes { get; set; }

        [Input("filterSettings", required: true)]
        public Input<Inputs.WebAppRequestErrorsErrorRulesErrorRuleFilterSettingsGetArgs> FilterSettings { get; set; } = null!;

        public WebAppRequestErrorsErrorRulesErrorRuleGetArgs()
        {
        }
        public static new WebAppRequestErrorsErrorRulesErrorRuleGetArgs Empty => new WebAppRequestErrorsErrorRulesErrorRuleGetArgs();
    }
}
