<script>
    import { serverURL } from "$lib";

    /**
     * @type {{ id: string; mileage: any; }}
     */
    export let traveller;

    async function send() {
        await fetch(serverURL + "/traveller/mileage/" + traveller.id, {
            method: "PUT",
            body: JSON.stringify({
                mileage: traveller.mileage,
            }),
            headers: {
                "Content-Type": "application/json",
            },
        });
    }
</script>

<li>
    Mileage:
    <input type="number" bind:value={traveller.mileage} />
    <button on:click={send}>Change</button>
</li>
