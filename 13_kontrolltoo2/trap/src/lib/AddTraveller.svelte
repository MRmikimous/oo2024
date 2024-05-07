<script>
    import { getTravellers, serverURL } from "$lib";

    export let travellers;

    /**
     * @type {(undefined|string)}
     */
    let name;

    let mileage = 0;

    let visitedCount = 0;

    async function send() {
        await fetch(serverURL + "/traveller", {
            method: "POST",
            body: JSON.stringify({
                name: name,
                mileage: mileage,
                visitedCount: visitedCount,
            }),
            headers: {
                "Content-Type": "application/json",
            },
        });

        name = "";
        mileage = 0;
        visitedCount = 0;
        travellers = await getTravellers(undefined);
    }
</script>

<h3>Add Traveller</h3>

<span>Name:</span>
<input type="text" bind:value={name} />
<br />

<span>Mileage:</span>
<input type="text" bind:value={mileage} />
<br />

<span>Name:</span>
<input type="text" bind:value={visitedCount} />
<br />

<button on:click={send}>Add Traveller</button>
<hr />
