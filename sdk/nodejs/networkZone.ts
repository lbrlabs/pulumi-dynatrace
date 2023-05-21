// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export class NetworkZone extends pulumi.CustomResource {
    /**
     * Get an existing NetworkZone resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NetworkZoneState, opts?: pulumi.CustomResourceOptions): NetworkZone {
        return new NetworkZone(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'dynatrace:index/networkZone:NetworkZone';

    /**
     * Returns true if the given object is an instance of NetworkZone.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is NetworkZone {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === NetworkZone.__pulumiType;
    }

    /**
     * A list of alternative network zones.
     */
    public readonly alternativeZones!: pulumi.Output<string[] | undefined>;
    /**
     * A short description of the network zone
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Name of the network zone, not case sensitive. Dynatrace stores the name in lowercase, allowed characters: alphanumeric, hyphen, underscore, dot
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The number of ActiveGates in the network zone.
     */
    public readonly numOfConfiguredActivegates!: pulumi.Output<number | undefined>;
    /**
     * The number of OneAgents that are configured to use the network zone as primary.
     */
    public readonly numOfConfiguredOneagents!: pulumi.Output<number | undefined>;
    /**
     * The number of OneAgents from other network zones that are using ActiveGates in the network zone.
     */
    public readonly numOfOneagentsFromOtherZones!: pulumi.Output<number | undefined>;
    /**
     * The number of OneAgents that are using ActiveGates in the network zone.
     */
    public readonly numOfOneagentsUsing!: pulumi.Output<number | undefined>;

    /**
     * Create a NetworkZone resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: NetworkZoneArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NetworkZoneArgs | NetworkZoneState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as NetworkZoneState | undefined;
            resourceInputs["alternativeZones"] = state ? state.alternativeZones : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["numOfConfiguredActivegates"] = state ? state.numOfConfiguredActivegates : undefined;
            resourceInputs["numOfConfiguredOneagents"] = state ? state.numOfConfiguredOneagents : undefined;
            resourceInputs["numOfOneagentsFromOtherZones"] = state ? state.numOfOneagentsFromOtherZones : undefined;
            resourceInputs["numOfOneagentsUsing"] = state ? state.numOfOneagentsUsing : undefined;
        } else {
            const args = argsOrState as NetworkZoneArgs | undefined;
            resourceInputs["alternativeZones"] = args ? args.alternativeZones : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["numOfConfiguredActivegates"] = args ? args.numOfConfiguredActivegates : undefined;
            resourceInputs["numOfConfiguredOneagents"] = args ? args.numOfConfiguredOneagents : undefined;
            resourceInputs["numOfOneagentsFromOtherZones"] = args ? args.numOfOneagentsFromOtherZones : undefined;
            resourceInputs["numOfOneagentsUsing"] = args ? args.numOfOneagentsUsing : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(NetworkZone.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering NetworkZone resources.
 */
export interface NetworkZoneState {
    /**
     * A list of alternative network zones.
     */
    alternativeZones?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A short description of the network zone
     */
    description?: pulumi.Input<string>;
    /**
     * Name of the network zone, not case sensitive. Dynatrace stores the name in lowercase, allowed characters: alphanumeric, hyphen, underscore, dot
     */
    name?: pulumi.Input<string>;
    /**
     * The number of ActiveGates in the network zone.
     */
    numOfConfiguredActivegates?: pulumi.Input<number>;
    /**
     * The number of OneAgents that are configured to use the network zone as primary.
     */
    numOfConfiguredOneagents?: pulumi.Input<number>;
    /**
     * The number of OneAgents from other network zones that are using ActiveGates in the network zone.
     */
    numOfOneagentsFromOtherZones?: pulumi.Input<number>;
    /**
     * The number of OneAgents that are using ActiveGates in the network zone.
     */
    numOfOneagentsUsing?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a NetworkZone resource.
 */
export interface NetworkZoneArgs {
    /**
     * A list of alternative network zones.
     */
    alternativeZones?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A short description of the network zone
     */
    description?: pulumi.Input<string>;
    /**
     * Name of the network zone, not case sensitive. Dynatrace stores the name in lowercase, allowed characters: alphanumeric, hyphen, underscore, dot
     */
    name?: pulumi.Input<string>;
    /**
     * The number of ActiveGates in the network zone.
     */
    numOfConfiguredActivegates?: pulumi.Input<number>;
    /**
     * The number of OneAgents that are configured to use the network zone as primary.
     */
    numOfConfiguredOneagents?: pulumi.Input<number>;
    /**
     * The number of OneAgents from other network zones that are using ActiveGates in the network zone.
     */
    numOfOneagentsFromOtherZones?: pulumi.Input<number>;
    /**
     * The number of OneAgents that are using ActiveGates in the network zone.
     */
    numOfOneagentsUsing?: pulumi.Input<number>;
}