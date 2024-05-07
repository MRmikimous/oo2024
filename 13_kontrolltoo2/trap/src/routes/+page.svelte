<script>
    import AddTraveller from "$lib/AddTraveller.svelte";
    import GetTraveller from "$lib/GetTraveller.svelte";
    import DelTraveller from "$lib/DelTraveller.svelte";
    import PutTravellerMileage from "$lib/PutTravellerMileage.svelte";
    import GetBiggestMileage from "$lib/GetBiggestMileage.svelte";
    /**
     * @type {any}
     */
    let travellers;
</script>

<button
    on:click={() => {
        travellers = [];
    }}
>
    Close
</button>

<AddTraveller bind:travellers />
<br />
<GetTraveller bind:travellers />
<br />
<br />
<DelTraveller bind:travellers />

{#if travellers !== undefined}
    {#each travellers as traveller}
        <ul>
            <li>ID: {traveller.id}</li>
            <li>Name: {traveller.name}</li>
            <PutTravellerMileage bind:traveller />
            <li>Visited: {traveller.visitedCount}</li>
        </ul>
    {/each}
{/if}

<hr />

<GetBiggestMileage />
