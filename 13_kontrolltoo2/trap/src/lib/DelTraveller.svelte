<script>
    import { getTravellers, serverURL } from "$lib";
    export let travellers;

    /**
     * @type {any}
     */
    let travellerID;

    async function send() {
        await fetch(serverURL + "/traveller/" + travellerID, {
            method: "Delete",
        });
        travellers = await getTravellers(undefined);
    }
</script>

<button on:click={send}> Delete Traveller </button>
<span>ID:</span><input type="number" bind:value={travellerID} />
