<script>
    import { serverURL } from "$lib";

    /**
     * @type {{ id: any; name: any; mileage: any; visitedCount: any; } | undefined}
     */
    let traveller;

    async function getBiggestTraveller() {
        let res = await fetch(serverURL + "/traveller/mileage/biggest");
        traveller = await res.json();
    }
</script>

<button on:click={getBiggestTraveller}>
    Get Traveller With Biggest Mileage
</button>

{#if traveller !== undefined}
    <ul>
        <li>ID: {traveller.id}</li>
        <li>Name: {traveller.name}</li>
        <li>Mileage: {traveller.mileage}</li>
        <li>Visited: {traveller.visitedCount}</li>
    </ul>
{/if}
