<script>
    import { getTravellers, serverURL } from "$lib";

    export let travellers;
    /**
     * @type {any}
     */
    let travellerID;
</script>

<button on:click={async () => (travellers = await getTravellers(travellerID))}>
    Get Travellers
</button>
<span>ID:</span><input type="number" bind:value={travellerID} />
