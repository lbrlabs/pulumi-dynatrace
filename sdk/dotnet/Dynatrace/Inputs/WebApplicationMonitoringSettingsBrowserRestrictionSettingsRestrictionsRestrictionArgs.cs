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

    public sealed class WebApplicationMonitoringSettingsBrowserRestrictionSettingsRestrictionsRestrictionArgs : global::Pulumi.ResourceArgs
    {
        [Input("browserType", required: true)]
        public Input<string> BrowserType { get; set; } = null!;

        [Input("browserVersion")]
        public Input<string>? BrowserVersion { get; set; }

        [Input("comparator")]
        public Input<string>? Comparator { get; set; }

        [Input("platform")]
        public Input<string>? Platform { get; set; }

        public WebApplicationMonitoringSettingsBrowserRestrictionSettingsRestrictionsRestrictionArgs()
        {
        }
        public static new WebApplicationMonitoringSettingsBrowserRestrictionSettingsRestrictionsRestrictionArgs Empty => new WebApplicationMonitoringSettingsBrowserRestrictionSettingsRestrictionsRestrictionArgs();
    }
}
