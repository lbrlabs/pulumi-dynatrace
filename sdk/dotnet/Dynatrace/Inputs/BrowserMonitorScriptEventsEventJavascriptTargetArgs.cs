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

    public sealed class BrowserMonitorScriptEventsEventJavascriptTargetArgs : global::Pulumi.ResourceArgs
    {
        [Input("locators")]
        private InputList<Inputs.BrowserMonitorScriptEventsEventJavascriptTargetLocatorArgs>? _locators;
        public InputList<Inputs.BrowserMonitorScriptEventsEventJavascriptTargetLocatorArgs> Locators
        {
            get => _locators ?? (_locators = new InputList<Inputs.BrowserMonitorScriptEventsEventJavascriptTargetLocatorArgs>());
            set => _locators = value;
        }

        [Input("window")]
        public Input<string>? Window { get; set; }

        public BrowserMonitorScriptEventsEventJavascriptTargetArgs()
        {
        }
        public static new BrowserMonitorScriptEventsEventJavascriptTargetArgs Empty => new BrowserMonitorScriptEventsEventJavascriptTargetArgs();
    }
}
