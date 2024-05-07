export const serverURL = 'http://localhost:8080'

/**
 * @param {string | undefined} travellerID
 */
export async function getTravellers(travellerID) {
    let res;

    if (travellerID == undefined) {
        res = await fetch(serverURL + "/traveller");
        return await res.json();
    } else {
        res = await fetch(serverURL + "/traveller/" + travellerID);
        return [await res.json()];
    }
}